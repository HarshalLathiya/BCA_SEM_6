from sklearn.datasets import load_iris
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler
import matplotlib.pyplot as plt

# Load dataset
data = load_iris()
X = data.data[:, :2]   # take only 2 features for visualization
y = data.target

# Split
X_train, X_test, y_train, y_test = train_test_split(
    X, y, test_size=0.3, random_state=0
)

# Normalize
sc = StandardScaler()
X_train = sc.fit_transform(X_train)
X_test = sc.transform(X_test)

# Plot training set
plt.scatter(X_train[:, 0], X_train[:, 1], c=y_train)
plt.title("Training Set (Normalized)")
plt.xlabel("Feature 1")
plt.ylabel("Feature 2")
plt.show()

# Plot testing set
plt.scatter(X_test[:, 0], X_test[:, 1], c=y_test)
plt.title("Testing Set (Normalized)")
plt.xlabel("Feature 1")
plt.ylabel("Feature 2")
plt.show()
