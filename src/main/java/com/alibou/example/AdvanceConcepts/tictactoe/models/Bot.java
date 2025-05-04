package com.alibou.example.AdvanceConcepts.tictactoe.models;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;

    public Bot(String name, Long id, Symbol symbol, PlayerType playerType,BotDifficultyLevel botDifficultyLevel) {
        super(name, id, symbol, playerType.BOT);
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }
}
