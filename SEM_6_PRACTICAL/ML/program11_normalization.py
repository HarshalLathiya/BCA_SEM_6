import numpy as np

data = np.array([10,20,30,40,50])

normalized = (data - np.min(data)) / (np.max(data) - np.min(data))

print("Original Data:",data)

print("Normalized Data:",normalized)