public class ExcludePopFilter implements GenreFilter {
    @Override
    public boolean permit(Album album) {
        return !"Pop".equals(album.genre());
    }
}
