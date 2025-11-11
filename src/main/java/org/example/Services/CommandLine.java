package org.example.Services;

import java.util.Scanner;

public class CommandLine implements ICommandLine {
    public Scanner _scanner;
    public IPlanRepository planRepository;

    public CommandLine(Scanner scanner,PlanRepository planRepository) {
        _scanner = scanner;
        this.planRepository = planRepository;
    }


    @Override
    public boolean CommandRun() {
        var command = _scanner.nextLine();
        if (command.equals("exit")) {
            return true;
        } else {

            return false;
        }
    }
}

