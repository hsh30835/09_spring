package com.ohgiraffers.section02.annotation.subsection02.qulifier;

import com.ohgiraffers.section02.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("pokemonServiceQulifier")
public class PokemonService {
//    @Autowired
//    @Qualifier("pikachu")
    private Pokemon pokemon;

    @Autowired
//    @Qualifier("pikachu") //에러남 여기에 넣으면 안됨
    public PokemonService(@Qualifier("pikachu") Pokemon pokemon) {
        //@Qualifier("pikachu") 넣어주면 피카츄가 나오고 빼면 파이리가 나옴
        this.pokemon = pokemon;
    }

    public void pokemonAttack(){
        pokemon.attack();
    }
}
