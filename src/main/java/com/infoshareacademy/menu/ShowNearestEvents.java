package com.infoshareacademy.menu;

import com.infoshareacademy.domain.parser.Event;
import com.infoshareacademy.repository.FilterRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;

public class ShowNearestEvents {

    private static final Logger stdout = LoggerFactory.getLogger("CONSOLE_OUT");

    void showNearestEvents() {
        FilterRepository filterRepository = new FilterRepository();
        int submenu2ExitCode = 0;

        while (submenu2ExitCode != 9) {
            stdout.info("\n");
            stdout.info("┌──────────────────────────────────────────┐\n");
            stdout.info("│                                          │\n");
            stdout.info("│  \u001b[33m Wybierz pozycję z menu używając cyfr  \u001b[0m │\n");
            stdout.info("│           \u001b[33m  na klawiaturze    \u001b[0m           │\n");
            stdout.info("│                                          │\n");
            stdout.info("│   1. Pokaż dzisiejsze wydarzenia         │\n");
            stdout.info("│   2. Pokaż jutrzejsze                    │\n");
            stdout.info("│   2. Pokaż wydarzenia za 3 dni           │\n");
            stdout.info("│                                          │\n");
            stdout.info("│  \u001b[36m 9. Wróć                       \u001b[0m         │\n");
            stdout.info("│                                          │\n");
            stdout.info("└──────────────────────────────────────────┘\n");
            stdout.info("\n");
            stdout.info("Wpisz liczbę: \n");

            switch (GetChoice.getChoice()) {
                case 1:
                    stdout.info("        WYBRANO OPCJĘ 1       \n");
                    for (Event event : filterRepository.filterAllDatesEvents(LocalDate.now().toString())) {
                        stdout.info(event.toString());
                        stdout.info("\n");
                    }
                    break;
                case 2:
                    stdout.info("        WYBRANO OPCJĘ 2       \n");
                    for (Event event : filterRepository.filterAllDatesEvents(LocalDate.now().plusDays(1).toString())) {
                        stdout.info(event.toString());
                        stdout.info("\n");
                    }
                    break;
                case 3:
                    stdout.info("        WYBRANO OPCJĘ 3       \n");
                    for (Event event : filterRepository.filterAllDatesEvents(LocalDate.now().plusDays(2).toString())) {
                        stdout.info(event.toString());
                        stdout.info("\n");
                    }
                    break;
                case 9:
                    stdout.info("        POWRÓT DO POPRZEDNIEGO MENU       \n");
                    submenu2ExitCode = 9;
                    break;
                case 0:
                    break;
                default:
                    //TODO metoda 1
                    stdout.info("\n");
                    stdout.info("┌──────────────────────────────────────────┐\n");
                    stdout.info("│                                          │\n");
                    stdout.info("│        \u001b[31mPOD TYM NUMEREM NIC NIE MA! \u001b[0m      │\n");
                    stdout.info("│                                          │\n");
                    stdout.info("│               JESZCZE RAZ!               │\n");
                    stdout.info("│                                          │\n");
                    stdout.info("└──────────────────────────────────────────┘\n");
                    stdout.info("\n");
            }
        }
    }
}