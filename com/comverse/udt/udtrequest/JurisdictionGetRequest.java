/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * JurisdictionGetRequest.java
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
 * Class used to create a JurisdictionGetRequest Udt Request
 *
 */

public class JurisdictionGetRequest extends JurisdictionSubRequestParent {
/**
 *
 * Constructor to create a  JurisdictionGetRequest
 * @param id Unique request name
 * @param jurGetIn JurisdictionObjectKeyData for JurisdictionGetRequest
 *
 */
@JsonCreator
  public JurisdictionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Jurisdiction")JurisdictionObjectKeyData jurGetIn) {
    super(id, "JurisdictionGet");
    if (jurGetIn != null) {
      addInput("Jurisdiction", JurisdictionObjectKeyHelper.toMap(jurGetIn, new HashMap(), "JurisdictionObjectKeyData").get("JurisdictionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the JurisdictionObjectData that results from the JurisdictionGetRequest call
 * @return JurisdictionObjectData resulting from udt call
 *
 */

  public JurisdictionObjectData getOutput() {
    return JurisdictionObjectHelper.fromMap(outputMap, "Jurisdiction");
  }
}
