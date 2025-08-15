# Football Formation Generator

## Description
The **Football Formation Generator** is a Java console-based tool that helps coaches, players, and football enthusiasts determine optimal formations based on their team’s player positions and match type.  
Users can input players with their positions, select the type of match (**Group Stage**, **Knock-out**, or **Final**), and instantly get recommended formations suited to their squad.  

The project follows a clean **MVC-style package structure**:
- `app` → Main entry point and user interaction.
- `model` → Player-related data models.
- `service` → Formation recommendation logic.

---

## Feature
Add players with their positions (GK, CB, LB, CM, ST, etc.).

Choose match type:

1 → Group Stage Match

2 → Knock-out Match

3 → Final Match

Get formation suggestions based on:

Number of defenders

Number of midfielders

Number of attackers

---


---

## 🚀 How to Run
1. **Clone the repository** (or download the folder).
   ```bash
   git clone https://github.com/yourusername/FootballFormationGenerator.git
   cd FootballFormationGenerator/src
2. Compile the project from the src folder
   ```bash
   javac app/Main.java model/*.java service/*.java
3. Run the project
   ```bash
   java app.Main

