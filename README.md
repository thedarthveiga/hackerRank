# HackerRank Solutions

Repository for HackerRank exercises in Java, following best practices and conventions enforced by ArchUnit.

## CI/CD Workflow

This repository uses GitHub Actions for Continuous Integration and Continuous Delivery (Auto-PR).

### Workflows
- **Java CI with Maven**: Runs `mvn package` on every push to `main`, `develop`, and `feature/*` branches.
- **Auto Pull Request**: Automatically creates a Pull Request after a successful CI run.
    - `feature/*` -> `develop` (Strictly enforced)
    - `develop` -> `main` (Strictly enforced)
    - Other branches are ignored.

### Branch Naming Conventions
- **Feature Branches**: Must start with `feature/` (e.g., `feature/add-login`).
- **Main Flow**: `feature/*` -> `develop` -> `main`.
- **Enforcement**: The CI pipeline will fail if you try to merge a non-compliant branch into `develop` or `main`.

## Branch Protection Setup

To fully protect your `main` and `develop` branches, you must configure Branch Protection Rules in the GitHub repository settings.

1. Go to **Settings** > **Branches**.
2. Click **Add branch protection rule**.
3. **Rule for `main`**:
    - **Branch name pattern**: `main`
    - Check **Require a pull request before merging**.
    - Check **Require status checks to pass before merging**.
        - Search for and select `build` (or the name of your CI job).
    - (Optional) Check **Do not allow bypassing the above settings**.
4. **Rule for `develop`**:
    - **Branch name pattern**: `develop`
    - Check **Require a pull request before merging**.
    - Check **Require status checks to pass before merging**.
5. Click **Create**.

## ArchUnit Conventions

We use ArchUnit to enforce:
- **Naming Conventions**: Classes in `problemSolving.algorithms` must end with `Algorithm`.
- **Cyclic Dependencies**: No cycles allowed in `problemSolving` packages.
- **Field Injection**: No `@Autowired` on fields (use constructor injection).