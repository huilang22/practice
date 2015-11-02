/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PpvReferenceDataGetRequest.java
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
 * Class used to create a PpvReferenceDataGetRequest Udt Request
 *
 */

public class PpvReferenceDataGetRequest extends PpvSubRequestParent {
/**
 *
 * Constructor to create a  PpvReferenceDataGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public PpvReferenceDataGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "PpvReferenceDataGet");
  }

/**
 *
 * Retrieves the PpvReferenceDataGetOutputData that results from the PpvReferenceDataGetRequest call
 * @return PpvReferenceDataGetOutputData resulting from udt call
 *
 */

  public PpvReferenceDataGetOutputData getOutput() {
    return PpvReferenceDataGetOutputHelper.fromMap(outputMap);
  }
}
