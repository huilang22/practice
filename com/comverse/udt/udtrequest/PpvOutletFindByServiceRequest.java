/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PpvOutletFindByServiceRequest.java
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
 * Class used to create a PpvOutletFindByServiceRequest Udt Request
 *
 */

public class PpvOutletFindByServiceRequest extends PpvSubRequestParent {
/**
 *
 * Constructor to create a  PpvOutletFindByServiceRequest
 * @param id Unique request name
 * @param _AccountIn PpvAccountObjectData for PpvOutletFindByServiceRequest
 *
 */
@JsonCreator
  public PpvOutletFindByServiceRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountIn")PpvAccountObjectData _AccountIn) {
    super(id, "PpvOutletFindByService");
    if (_AccountIn != null) {
      addInput("AccountIn", PpvAccountObjectHelper.toMap(_AccountIn, new HashMap(), "AccountOut").get("AccountOut"));
    }
  }

/**
 *
 * Retrieves the PpvAccountObjectData that results from the PpvOutletFindByServiceRequest call
 * @return PpvAccountObjectData resulting from udt call
 *
 */

  public PpvAccountObjectData getOutput() {
    return PpvAccountObjectHelper.fromMap(outputMap, "AccountOut");
  }
}
