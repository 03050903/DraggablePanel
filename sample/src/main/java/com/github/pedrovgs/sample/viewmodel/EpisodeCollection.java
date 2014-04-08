/*
 * Copyright (C) 2014 Pedro Vicente Gómez Sánchez.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.pedrovgs.sample.viewmodel;

import com.pedrogomez.renderers.AdapteeCollection;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Pedro Vicente Gómez Sánchez.
 */
public class EpisodeCollection implements AdapteeCollection<EpisodeViewModel> {

    private final List<EpisodeViewModel> episodes;

    public EpisodeCollection() {
        this.episodes = new LinkedList<EpisodeViewModel>();
    }

    @Override
    public int size() {
        return episodes.size();
    }

    @Override
    public EpisodeViewModel get(int i) {
        return episodes.get(i);
    }

    @Override
    public void add(EpisodeViewModel episodeViewModel) {
        episodes.add(episodeViewModel);
    }

    @Override
    public void remove(EpisodeViewModel episodeViewModel) {
        episodes.remove(episodeViewModel);
    }

    @Override
    public void addAll(Collection<EpisodeViewModel> episodeViewModels) {
        episodes.addAll(episodeViewModels);
    }

    @Override
    public void removeAll(Collection<EpisodeViewModel> episodeViewModels) {
        episodes.removeAll(episodeViewModels);
    }
}
