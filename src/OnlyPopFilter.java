public class OnlyPopFilter implements GenreFilter {
    @Override
    public boolean permit(Album album) {
        return "Pop".equals(album.genre());
    }
}