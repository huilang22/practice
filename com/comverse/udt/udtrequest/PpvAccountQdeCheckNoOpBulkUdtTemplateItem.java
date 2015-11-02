/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PpvAccountQdeCheckNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;
import com.csgsystems.cf.data.*;
import com.csgsystems.ctc.data.*;
import com.csgsystems.om.data.*;
import com.csgsystems.ppv.data.*;

/**
 *
 * NoOp class used to simulate a PpvAccountQdeCheckNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PpvAccountQdeCheckNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PpvAccountObjectData noOpIn;

/**
 *
 * Constructor to create a   PpvAccountQdeCheckNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PpvAccountQdeCheckNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PpvAccountObjectData noOpInIn) {
    super(id, context, "PpvAccountQdeCheck");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AccountOut", PpvAccountObjectHelper.toMap(noOpIn, new HashMap(), "AccountOut").get("AccountOut"));
    }
  }
/**
 *
 * Sets the  AccountOut
 * @param noOpInIn PpvAccountObjectData to set
 *
 */
  public void setAccountOut(PpvAccountObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountOut passed into the constructor
 * @return Simulated response
 *
 */
  public PpvAccountObjectData getAccountOut() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PpvAccountObjectHelper.fromMap(inputMap, "AccountOut");
  }
}
