/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EpiUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a EpiUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EpiUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EpiObjectData noOpIn;

/**
 *
 * Constructor to create a   EpiUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EpiUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EpiObjectData noOpInIn) {
    super(id, context, "EpiUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Epi", EpiObjectHelper.toMap(noOpIn, new HashMap(), "Epi").get("Epi"));
    }
  }
/**
 *
 * Sets the  Epi
 * @param noOpInIn EpiObjectData to set
 *
 */
  public void setEpi(EpiObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Epi passed into the constructor
 * @return Simulated response
 *
 */
  public EpiObjectData getEpi() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = EpiObjectHelper.fromMap(inputMap, "Epi");
  }
}
