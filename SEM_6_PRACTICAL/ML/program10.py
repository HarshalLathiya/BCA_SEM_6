import numpy as np
from sklearn.preprocessing import StandardScaler

# Sample dataset (features)
X = np.array([[10, 200],
              [20, 300],
              [30, 400],
              [40, 500]])

print("Original Data:")
print(X)

# Create StandardScaler object
scaler = StandardScaler()

# Apply standardization
X_scaled = scaler.fit_transform(X)

print("\nData after Standardization:")
print(X_scaled)
