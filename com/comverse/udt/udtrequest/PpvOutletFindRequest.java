/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PpvOutletFindRequest.java
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

import com.csgsystems.ppv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a PpvOutletFindRequest Udt Request
 *
 */

public class PpvOutletFindRequest extends PpvOutletRequest {
/**
 *
 * Constructor to create a  PpvOutletFindRequest
 * @param id Unique request name
 * @param FindIn PpvOutletObjectFilter for PpvOutletFindRequest
 *
 */
@JsonCreator
  public PpvOutletFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("PpvOutlet")PpvOutletObjectFilter FindIn) {
    super(id, "PpvOutletFind");
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PpvOutlet", PpvOutletObjectHelper.toMap(FindIn, new HashMap(), "PpvOutlet").get("PpvOutlet"));
    }
  }

/**
 *
 * Retrieves the PpvOutletObjectDataList that results from the PpvOutletFindRequest call
 * @return PpvOutletObjectDataList resulting from udt call
 *
 */

  public PpvOutletObjectDataList getOutput() {
    return PpvOutletObjectHelper.fromMapList(outputMap, "PpvOutletList");
  }
}
