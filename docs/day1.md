# Day 1 - Development Environment & Engineering Setup

## What I Learned

### Development Environment

A Development Environment is a setup where we write, test, and run our code.  
It includes tools like VS Code, Git, Postman, etc.

### Engineering Setup

Engineering Setup is a more professional version of a development environment.  
It represents how software projects are structured and maintained in real companies.

### Role of a Software Engineer

A Software Engineer not only writes code but also:

- Maintains proper project structure
- Uses version control
- Collaborates with team members
- Writes documentation

### What is Git?

Git is a version control system that tracks changes in files over time.  
It helps in collaboration and managing code efficiently.

### Basic Git Concepts

- Repository: A project folder tracked by Git
- Branch: A separate line of development
- Pull Request: Request to merge changes into main branch

---

## Git Setup

1. Install Git from browser
2. Open Git Bash
3. Check installation:
   git --version

4. Configure username and email:
   git config --global user.name "your name"  
   git config --global user.email "your email"

5. Verify configuration:
   git config user.name  
   git config user.email

6. Set default branch:
   git config --global init.defaultBranch main

---

## What I Did Practically

- Created project folder: Enterprise_engineering
- Created structured folders:
  - backend
  - frontend
  - docs
  - architecture
  - scripts
  - experiments

- Initialized Git:
  git init

- Created README file

- Learned that Git does not track empty folders
- Added .gitkeep files to track folders

- Created GitHub repository and connected using:
  git remote add origin <repo link>

- Added and committed files:
  git add .
  git commit -m "Initial project structure"

- Pushed project to GitHub:
  git push -u origin main

---

## Challenges Faced

- Initialized Git in wrong directory
- Faced push errors
- Empty folders were not visible

---

## Key Learnings

- Git tracks only files, not empty folders
- Proper project structure is important
- README and documentation are essential
- Correct directory setup is very important

## Why Engineering Setup is Important

- Helps maintain clean and organized code
- Makes collaboration easier in teams
- Improves scalability of projects
- Follows industry standards

## Tools Used

- VS Code (Code Editor)
- Git (Version Control)
- GitHub (Code Hosting)
- Git Bash (Terminal)
