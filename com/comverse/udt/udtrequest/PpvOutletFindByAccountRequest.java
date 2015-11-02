/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PpvOutletFindByAccountRequest.java
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

import com.csgsystems.bp.data.*;
import com.csgsystems.cf.data.*;
import com.csgsystems.ctc.data.*;
import com.csgsystems.om.data.*;
import com.csgsystems.ppv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a PpvOutletFindByAccountRequest Udt Request
 *
 */

public class PpvOutletFindByAccountRequest extends PpvSubRequestParent {
/**
 *
 * Constructor to create a  PpvOutletFindByAccountRequest
 * @param id Unique request name
 * @param AccountIn PpvAccountObjectData for PpvOutletFindByAccountRequest
 *
 */
@JsonCreator
  public PpvOutletFindByAccountRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountIn")PpvAccountObjectData AccountIn) {
    super(id, "PpvOutletFindByAccount");
    if (AccountIn != null) {
      addInput("AccountIn", PpvAccountObjectHelper.toMap(AccountIn, new HashMap(), "AccountOut").get("AccountOut"));
    }
  }

/**
 *
 * Retrieves the PpvAccountObjectData that results from the PpvOutletFindByAccountRequest call
 * @return PpvAccountObjectData resulting from udt call
 *
 */

  public PpvAccountObjectData getOutput() {
    return PpvAccountObjectHelper.fromMap(outputMap, "AccountOut");
  }
}
