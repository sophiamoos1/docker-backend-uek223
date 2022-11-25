package com.example.demo.domain.myListEntry;
import com.example.demo.domain.utils.TestUtility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@SpringBootTest
@AutoConfigureMockMvc
class MyListEntryServiceTest {

    @Autowired
    private MyListEntryServiceImpl myListEntryService;

    @MockBean
    private MyListEntryRepository myListEntryRepository;

    private TestUtility dishTestUtility = new TestUtility();

    MyListEntry listEntry1 = dishTestUtility.getMyListEntry1();
    MyListEntry listEntry2 = dishTestUtility.getMyListEntry2();
    MyListEntry listEntry3 = dishTestUtility.getMyListEntry3();
    MyListEntry listEntry4 = dishTestUtility.getMyListEntry4();
    MyListEntry listEntry5 = dishTestUtility.getMyListEntry5();

    @Disabled
    @Test
    void getAllDishesReturnsCorrectly() throws Exception {

        List expectedResult = List.of(listEntry1, listEntry2, listEntry3, listEntry4, listEntry5);

        //When
        Mockito.when(myListEntryRepository.findAll()).thenReturn(expectedResult);
        List actualResult = myListEntryService.findAll();

        //Then
        Assertions.assertEquals(expectedResult, actualResult);
        verify(myListEntryRepository, times(1)).findAll();
    }
}
