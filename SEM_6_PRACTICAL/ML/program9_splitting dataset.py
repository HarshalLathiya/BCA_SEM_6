import numpy as np
from sklearn.model_selection import train_test_split

# Sample dataset (features and labels)
X = np.array([[1], [2], [3], [4], [5]])
y = np.array([10, 20, 30, 40, 50])

print("Original Features:")
print(X)

print("\nOriginal Labels:")
print(y)

# Split the dataset into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(
    X, y, test_size=0.2, random_state=42
)

print("\nTraining Features:")
print(X_train)

print("\nTesting Features:")
print(X_test)

print("\nTraining Labels:")
print(y_train)

print("\nTesting Labels:")
print(y_test)
