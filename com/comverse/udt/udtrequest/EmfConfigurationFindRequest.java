/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigurationFindRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a EmfConfigurationFindRequest Udt Request
 *
 */

public class EmfConfigurationFindRequest extends EmfConfigurationRequest {
/**
 *
 * Constructor to create a  EmfConfigurationFindRequest
 * @param id Unique request name
 * @param EmfConfigurationFindIn EmfConfigurationObjectFilter for EmfConfigurationFindRequest
 *
 */
@JsonCreator
  public EmfConfigurationFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("EmfConfiguration")EmfConfigurationObjectFilter EmfConfigurationFindIn) {
    super(id, "EmfConfigurationFind");
    if (EmfConfigurationFindIn != null) {
      Integer index =  EmfConfigurationFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("EmfConfiguration", EmfConfigurationObjectHelper.toMap(EmfConfigurationFindIn, new HashMap(), "EmfConfiguration").get("EmfConfiguration"));
    }
  }

/**
 *
 * Retrieves the EmfConfigurationObjectDataList that results from the EmfConfigurationFindRequest call
 * @return EmfConfigurationObjectDataList resulting from udt call
 *
 */

  public EmfConfigurationObjectDataList getOutput() {
    return EmfConfigurationObjectHelper.fromMapList(outputMap, "EmfConfigurationList");
  }
}
