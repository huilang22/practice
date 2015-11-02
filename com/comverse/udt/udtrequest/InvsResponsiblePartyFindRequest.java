/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsResponsiblePartyFindRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsResponsiblePartyFindRequest Udt Request
 *
 */

public class InvsResponsiblePartyFindRequest extends InvsResponsiblePartyRequest {
/**
 *
 * Constructor to create a  InvsResponsiblePartyFindRequest
 * @param id Unique request name
 * @param IRPFindIn InvsResponsiblePartyObjectFilter for InvsResponsiblePartyFindRequest
 *
 */
@JsonCreator
  public InvsResponsiblePartyFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsResponsibleParty")InvsResponsiblePartyObjectFilter IRPFindIn) {
    super(id, "InvsResponsiblePartyFind");
    if (IRPFindIn != null) {
      Integer index =  IRPFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsResponsibleParty", InvsResponsiblePartyObjectHelper.toMap(IRPFindIn, new HashMap(), "InvsResponsibleParty").get("InvsResponsibleParty"));
    }
  }

/**
 *
 * Retrieves the InvsResponsiblePartyObjectDataList that results from the InvsResponsiblePartyFindRequest call
 * @return InvsResponsiblePartyObjectDataList resulting from udt call
 *
 */

  public InvsResponsiblePartyObjectDataList getOutput() {
    return InvsResponsiblePartyObjectHelper.fromMapList(outputMap, "InvsResponsiblePartyList");
  }
}
