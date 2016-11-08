/*
 * Copyright 2010 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.gadgets.client.rpc;

import com.google.gwt.gadgets.client.GadgetFeature.FeatureName;

/**
 * Indicates that a Gadget requires the gadgets.rpc feature.
 */
@FeatureName("rpc")
public interface NeedsRpc {
  /**
   * Entry point that gets called back to handle rpc feature initialization.
   * 
   * @param feature an instance of the feature to use to invoke feature specific
   *          methods.
   */
  void initializeFeature(RpcFeature feature);
}
