/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTransDescrQuoteNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a NrcTransDescrQuoteNoOpRequest Udt Request/Response
 *
 */
public class NrcTransDescrQuoteNoOpRequest extends NrcTransDescrSubRequestParent {
/**
 *
 * Constructor to create a   NrcTransDescrQuoteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NrcTransDescrQuoteNoOpRequest(String id, NrcTransDescrQuoteOutputData noOpIn) {
    super(id, "NrcTransDescrQuoteNoOpRequest");
    if (noOpIn != null) {
      addInput("NrcTransDescrQuoteOutputData", NrcTransDescrQuoteOutputHelper.toMap(noOpIn).get("NrcTransDescrQuoteOutputData"));
    }
  }
/**
 *
 * Retrieves the NrcTransDescrQuoteOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public NrcTransDescrQuoteOutputData getOutput() {
    return NrcTransDescrQuoteOutputHelper.fromMap(outputMap);
  }
}
