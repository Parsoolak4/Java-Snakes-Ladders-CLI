# 🎲 Java Snakes & Ladders CLI

[![Java](https://img.shields.io/badge/Java-SE_8+-orange.svg)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-Educational-blue.svg)]()
[![Platform](https://img.shields.io/badge/Platform-Cross--platform-green.svg)]()

A classic command-line implementation of the beloved Snakes and Ladders board game! 🐍🪜 Challenge a friend in this thrilling race to the top of the board.

## ✨ Features

### 🎮 Game Elements
- **🎲 Dynamic Dice Rolling**: Random number generation for authentic gameplay
- **🪜 Power-Up Ladders**: Climb to victory with strategic ladder positions
- **🐍 Treacherous Snakes**: Watch out for slithering setbacks!
- **👥 Two-Player Action**: Perfect for competitive duos

### 🎯 Board Details
| Element | Count | Effect |
|---------|--------|--------|
| Ladders | 9 | Boost upward |
| Snakes | 8 | Slide downward |
| Squares | 100 | Progress tracking |

## 🚀 Getting Started

### Prerequisites
- ☕ Java SE 8 or higher
- 🖥️ Command-line interface

### Installation
```bash
# Clone the repository
git clone https://github.com/yourusername/java-snakes-and-ladders-cli.git

# Navigate to game directory
cd java-snakes-and-ladders-cli

# Compile the game
javac PlayLadderAndSnake.java LadderAndSnake.java

# Run the game
java PlayLadderAndSnake
```

## 🎮 How to Play

### Controls
- Follow on-screen prompts
- Enter player names when requested
- Press any key to roll the dice
- Watch your progress on the board!

### 🪜 Ladder Boosts
| Start | End | Boost |
|-------|-----|-------|
| 1 | 38 | +37 |
| 4 | 14 | +10 |
| 9 | 31 | +22 |
| 21 | 84 | +63 |
| 28 | 42 | +14 |
| 36 | 44 | +8 |
| 51 | 67 | +16 |
| 71 | 91 | +20 |
| 80 | 100 | +20 |

### 🐍 Snake Slides
| Start | End | Drop |
|-------|-----|------|
| 16 | 6 | -10 |
| 48 | 30 | -18 |
| 64 | 60 | -4 |
| 79 | 19 | -60 |
| 93 | 68 | -25 |
| 95 | 24 | -71 |
| 97 | 76 | -21 |
| 98 | 78 | -20 |

## 🛠️ Technical Architecture

### Project Structure
```
java-snakes-and-ladders-cli/
├── PlayLadderAndSnake.java  # Game initialization
└── LadderAndSnake.java      # Core game logic
```

### Key Components
- 🎲 Random Number Generator
- 🎮 Game State Manager
- 👥 Player Position Tracker
- 🔄 Turn Controller

## 💻 Implementation Details

### Features
- Object-oriented design
- Clean code architecture
- Robust error handling
- Input validation
- Cross-platform compatibility

### Code Example
```java
public int flipDice() {
    Random dice = new Random();
    return dice.nextInt(6) + 1;
}
```

## 🤝 Contributing

Want to make the game even better? Here's how:

1. Fork the repository
2. Create a feature branch
3. Make your improvements
4. Submit a pull request

### Areas for Enhancement
- 🎨 Graphical user interface
- 🌐 Network multiplayer support
- 💾 Save game functionality
- 🏆 High score system

## 👨‍💻 Author

Created with 🎲 by Parsa Ghadimi (40203370)

## 📜 License

This project is available for educational purposes and learning reference. Have fun learning! 🎉

---
Made with ❤️ and ☕
