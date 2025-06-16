In our Git-based project, we had an existing stable codebase. A client requested an enhancement, which Developer A took on by creating a feature branch, implementing the required changes, and successfully merging and deploying them to the main branch.

Later, the client requested an additional feature. This task was assigned to Developer B, who also created a separate branch from the main branch (prior to Developer A’s merge), implemented their changes, and eventually merged them into main and deployed.

After Developer B’s deployment, we noticed that the previous changes made by Developer A were no longer present in the main branch—only Developer B’s changes remained.

How can we recover Developer A’s changes without losing Developer B’s work? Additionally, what steps can we take to avoid such issues in the future when multiple developers are working on different features in parallel?


