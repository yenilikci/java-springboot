public class Comment { //yorum özellik sınıfı
    int _id;
    int _userId;
    int _courseId;
    String _detail;
    String[] _imageUrlList;

    public Comment(int id, int userId, int courseId, String detail, String[] imageUrlList) {
        this._id = id;
        this._userId = userId;
        this._courseId = courseId;
        this._detail = detail;
        this._imageUrlList = imageUrlList;
    }

}
