import numpy as np
from sklearn.preprocessing import Binarizer

data = np.array([[0.5],[1.5],[2.5],[3.5],[4.5]])

binarizer = Binarizer(threshold=2.0)
binarized_data = binarizer.fit_transform(data)

print("Original Data:\n",data)
print("Binarized Data:\n",binarized_data)