package hu.nye.progkor.Ruhak.service.impl;

import hu.nye.progkor.Ruhak.data.model.Marka;
import hu.nye.progkor.Ruhak.data.model.Ruhak;
import hu.nye.progkor.Ruhak.data.repository.Repository;
import hu.nye.progkor.Ruhak.service.RuhakService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

/**
 * Unit tests for {@link DefaultRuhakService}.
 */
class DefaultRuhakServiceTest {

    private static final Long DUMMY_RUHAK_ID = 1L;
    private static final Ruhak DUMMY_RUHAK = new Ruhak(DUMMY_RUHAK_ID,"meret","szin",200, Marka.NIKE );
    @Mock
    private Repository<Ruhak, Long> ruhakRepository;

    private RuhakService underTest;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        underTest = new DefaultRuhakService(ruhakRepository);
    }

    @Test
    void createRuhakShouldDelegateToTheRepositoryAndReturnSaveRuhak() {
        //Given
        given(ruhakRepository.save(DUMMY_RUHAK)).willReturn(DUMMY_RUHAK);

        //When
        final Ruhak actual = underTest.createRuhak(DUMMY_RUHAK);

        //Then
        assertThat(actual, equalTo(DUMMY_RUHAK));
        verify(ruhakRepository).save(DUMMY_RUHAK);
        verifyNoMoreInteractions(ruhakRepository);


    }

    @Test
    void retrieveRuhakById() {
    }

    @Test
    void retrieveAllRuhak() {
    }

    @Test
    void updateRuhak() {
    }

    @Test
    void deleteRuhakById() {
    }
}