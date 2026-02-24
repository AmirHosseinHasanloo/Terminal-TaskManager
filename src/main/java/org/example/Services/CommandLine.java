package org.example.Services;

import org.example.CommandEnums.CommandEnum;

import java.util.Scanner;

public class CommandLine implements ICommandLine {
    public Scanner _scanner;
    public IPlanRepository planRepository;

    public CommandLine(Scanner scanner, PlanRepository planRepository) {
        _scanner = scanner;
        this.planRepository = planRepository;
    }


    @Override
    public CommandEnum CommandRun() {
        var command = _scanner.nextLine();

        switch (command) {
            case "exit":
                return CommandEnum.EXIT;
            case "create":
                return CommandEnum.CREATE;
            case "read":
                return CommandEnum.READ;
            case "update":
                return CommandEnum.UPDATE;
            case "delete":
                return CommandEnum.DELETE;
            case "list":
                return CommandEnum.LIST;
            case "--help":
                return CommandEnum.HELP;
            default:
                return CommandEnum.ERROR;
        }
    }

    @Override
    public void Command() {
        var response = CommandRun();

        switch (response) {
            case CommandEnum.EXIT -> System.out.println("EXIT");
            case CommandEnum.CREATE -> System.out.println("Create");
            case CommandEnum.READ -> System.out.println("Read");
            case CommandEnum.UPDATE -> System.out.println("Update");
            case CommandEnum.DELETE -> System.out.println("Delete");
            case CommandEnum.LIST -> System.out.println("List");
            case CommandEnum.HELP -> System.out.println("help");
            case CommandEnum.ERROR -> System.out.println("Error");
        }
    }
}

