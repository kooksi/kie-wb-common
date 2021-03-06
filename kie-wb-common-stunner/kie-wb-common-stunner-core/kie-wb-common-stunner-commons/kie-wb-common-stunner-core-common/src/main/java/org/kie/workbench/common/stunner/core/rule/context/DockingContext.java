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

import java.util.Set;

import org.kie.workbench.common.stunner.core.rule.RuleEvaluationContext;
import org.kie.workbench.common.stunner.core.rule.handler.impl.DockingEvaluationHandler;
import org.kie.workbench.common.stunner.core.rule.impl.CanDock;

/**
 * This rule evaluation context provides the runtime information
 * that allows the evaluation for docking related operations.
 * @See {@link CanDock}
 * @See {@link DockingEvaluationHandler}
 */
public interface DockingContext extends RuleEvaluationContext {

    /**
     * The identifier of the Definition type that provides
     * the docking restriction. Eg: NoneTask
     */
    String getId();

    /**
     * The set of roles that a candidate Definition
     * instance must provide as for its graph
     * element's labels.
     */
    Set<String> getAllowedRoles();
}
