import pandas as pd
from sklearn.feature_extraction.text import CountVectorizer
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LogisticRegression
from sklearn.metrics import accuracy_score,confusion_matrix
from sklearn import metrics
data = pd.read_csv("spam.csv", encoding='latin-1')
data.rename(columns={'v1': 'label', 'v2': 'text'}, inplace=True)
data['label'] = data['label'].map({'ham': 0, 'spam': 1})
vectorizer = CountVectorizer()
X = vectorizer.fit_transform(data['text'])
y = data['label']
X_train, X_test, y_train, y_test = train_test_split(X, y,
test_size=0.25, random_state=42)
model = LogisticRegression(random_state=42)
model.fit(X_train, y_train)
acc = accuracy_score(y_test, model.predict(X_test)) * 100
print("Logistic Regression model accuracy",acc)
y_pred = model.predict(X_test)
print(y_pred)
cnf_matrix = metrics.confusion_matrix(y_test, y_pred)
print(cnf_matrix)
def classify_message(model, vectorizer, message):
    message_vect = vectorizer.transform([message])
    prediction = model.predict(message_vect)
    return "ham" if prediction[0] == 0 else "spam"
message = "Is that seriously how you spell his name?"
print(classify_message(model, vectorizer, message))