/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTransDescrGetNoOpBulkUdtTemplateItem.java
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

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a NrcTransDescrGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NrcTransDescrGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NrcTransDescrObjectData noOpIn;

/**
 *
 * Constructor to create a   NrcTransDescrGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NrcTransDescrGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcTransDescrObjectData noOpInIn) {
    super(id, context, "NrcTransDescrGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("NrcTransDescr", NrcTransDescrObjectHelper.toMap(noOpIn, new HashMap(), "NrcTransDescr").get("NrcTransDescr"));
    }
  }
/**
 *
 * Sets the  NrcTransDescr
 * @param noOpInIn NrcTransDescrObjectData to set
 *
 */
  public void setNrcTransDescr(NrcTransDescrObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the NrcTransDescr passed into the constructor
 * @return Simulated response
 *
 */
  public NrcTransDescrObjectData getNrcTransDescr() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NrcTransDescrObjectHelper.fromMap(inputMap, "NrcTransDescr");
  }
}
