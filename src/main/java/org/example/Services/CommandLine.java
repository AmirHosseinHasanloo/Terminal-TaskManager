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
            default:
                return CommandEnum.ERROR;
        }
    }
}

