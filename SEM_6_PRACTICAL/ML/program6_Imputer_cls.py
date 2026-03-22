import numpy as np
from sklearn.impute import SimpleImputer

# Dataset with missing values
data = [[10, 20, np.nan],
        [30, np.nan, 40],
        [50, 60, 70]]

print("Original Data")
print(data)

# Create Imputer
imputer = SimpleImputer(strategy='mean')

# Fit and transform data
new_data = imputer.fit_transform(data)

print("\nAfter Handling Missing Values")
print(new_data)
