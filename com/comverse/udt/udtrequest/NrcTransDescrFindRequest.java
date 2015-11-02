/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTransDescrFindRequest.java
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
 * Class used to create a NrcTransDescrFindRequest Udt Request
 *
 */

public class NrcTransDescrFindRequest extends NrcTransDescrRequest {
/**
 *
 * Constructor to create a  NrcTransDescrFindRequest
 * @param id Unique request name
 * @param nrcFindIn NrcTransDescrObjectFilter for NrcTransDescrFindRequest
 *
 */
@JsonCreator
  public NrcTransDescrFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("NrcTransDescr")NrcTransDescrObjectFilter nrcFindIn) {
    super(id, "NrcTransDescrFind");
    if (nrcFindIn != null) {
      Integer index =  nrcFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("NrcTransDescr", NrcTransDescrObjectHelper.toMap(nrcFindIn, new HashMap(), "NrcTransDescr").get("NrcTransDescr"));
    }
  }

/**
 *
 * Retrieves the NrcTransDescrObjectDataList that results from the NrcTransDescrFindRequest call
 * @return NrcTransDescrObjectDataList resulting from udt call
 *
 */

  public NrcTransDescrObjectDataList getOutput() {
    return NrcTransDescrObjectHelper.fromMapList(outputMap, "NrcTransDescrList");
  }
}
