package org.example;

import org.example.Services.CommandLine;
import org.example.Services.ICommandLine;
import org.example.Services.IPlanRepository;
import org.example.Services.PlanRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlannerApp {
    private final Scanner scanner;
    private final ICommandLine commandRunner;
    private final IPlanRepository planRepository;

    PlannerApp(Scanner scanner, ICommandLine commandRunner, IPlanRepository planRepository) {
        this.scanner = scanner;
        this.commandRunner = commandRunner;
        this.planRepository = planRepository;
    }

    public void run() {
        while (true) {
            System.out.printf("Welcome to hackers day planner\n");

            System.out.printf("What do you want to do? wrote it down here:");
            planRepository.Create(scanner.nextLine());

            if (commandRunner.CommandRun()) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var planRepository = new PlanRepository();
        var runner = new CommandLine(scanner, planRepository);

        var app = new PlannerApp(scanner, runner, planRepository);

        app.run();
    }
}
