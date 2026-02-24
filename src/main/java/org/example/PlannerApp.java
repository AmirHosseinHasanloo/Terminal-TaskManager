package org.example;

import org.example.Services.CommandLine;
import org.example.Services.ICommandLine;
import org.example.Services.IPlanRepository;
import org.example.Services.PlanRepository;
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
        System.out.println("Welcome to hackers task planner\n");
        while (true) {
            System.out.println("For help on usage --help :");

            // TODO: Create An Engine that makes choices with Command runner output
            commandRunner.Command();
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
