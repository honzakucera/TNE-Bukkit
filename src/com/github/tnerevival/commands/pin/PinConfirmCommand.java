package com.github.tnerevival.commands.pin;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.github.tnerevival.TNE;
import com.github.tnerevival.account.Account;
import com.github.tnerevival.commands.TNECommand;
import com.github.tnerevival.core.Message;
import com.github.tnerevival.utils.AccountUtils;
import com.github.tnerevival.utils.MISCUtils;

public class PinConfirmCommand extends TNECommand {
	
	public PinConfirmCommand(TNE plugin) {
		super(plugin);
	}

	@Override
	public String getName() {
		return "confirm";
	}

	@Override
	public String[] getAliases() {
		return new String[0];
	}

	@Override
	public String getNode() {
		return "tne.pin.confirm";
	}

	@Override
	public boolean console() {
		return false;
	}
	
	@Override
	public boolean execute(CommandSender sender, String[] arguments) {
		Player player = (Player)sender;
		
		if(TNE.instance.manager.confirmed.contains(MISCUtils.getID(player))) {
			Message message = new Message("Messages.Pin.Already");
			sender.sendMessage(message.translate());
			return false;
		}
		
		if(arguments.length > 0 && arguments.length < 2) {
			Account acc = AccountUtils.getAccount(MISCUtils.getID(player));
			if(acc.getPin().equalsIgnoreCase("TNENOSTRINGVALUE")) {
				Message message = new Message("Messages.Account.Set");
				sender.sendMessage(message.translate());
				return false;
			}
			
			if(!acc.getPin().equalsIgnoreCase("TNENOSTRINGVALUE") && !acc.getPin().equals(arguments[0])) {
				help(sender);
				return false;
			}
			
			TNE.instance.manager.confirmed.add(MISCUtils.getID(player));
			Message message = new Message("Messages.Pin.Confirmed");
			sender.sendMessage(message.translate());
			return true;
		}
		help(sender);
		return false;
	}

	@Override
	public void help(CommandSender sender) {
		sender.sendMessage(ChatColor.GOLD + "/pin confirm <pin> - Cofirm your identity with your account pin. Pins are case-sensitive.");
	}
}