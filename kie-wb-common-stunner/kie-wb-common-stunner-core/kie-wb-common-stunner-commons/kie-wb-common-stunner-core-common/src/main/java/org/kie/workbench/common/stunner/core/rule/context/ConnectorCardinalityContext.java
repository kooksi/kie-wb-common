/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.workbench.common.stunner.core.rule.context;

import org.kie.workbench.common.stunner.core.graph.Edge;
import org.kie.workbench.common.stunner.core.graph.Node;
import org.kie.workbench.common.stunner.core.graph.content.view.View;
import org.kie.workbench.common.stunner.core.rule.handler.impl.EdgeCardinalityEvaluationHandler;
import org.kie.workbench.common.stunner.core.rule.impl.EdgeOccurrences;

/**
 * This rule evaluation context provides the runtime information
 * that allows the evaluation for cardinality operations about
 * edges or connectors.
 * @See {@link EdgeOccurrences}
 * @See {@link EdgeCardinalityEvaluationHandler}
 */
public interface ConnectorCardinalityContext extends ElementCardinalityContext {

    /**
     * The connector's direction.
     */
    enum Direction {
        INCOMING,
        OUTGOING;
    }

    /**
     * The connector's graph element.
     */
    Edge<? extends View<?>, Node> getEdge();

    /**
     * The direction.
     */
    Direction getDirection();
}
