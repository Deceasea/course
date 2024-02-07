package ru.decease.lesson7.timestamp;

import java.time.LocalDateTime;

public interface HumanReadableTimestamp {
    String format(LocalDateTime timestamp);
}
