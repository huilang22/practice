/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationSequenceGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a BsdApplicationSequenceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdApplicationSequenceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdApplicationObjectKeyData noOpIn;

/**
 *
 * Constructor to create a   BsdApplicationSequenceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdApplicationSequenceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationObjectKeyData noOpInIn) {
    super(id, context, "BsdApplicationSequenceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdApplication", BsdApplicationObjectKeyHelper.toMap(noOpIn, new HashMap(), "BsdApplication").get("BsdApplication"));
    }
  }
/**
 *
 * Sets the  BsdApplication
 * @param noOpInIn BsdApplicationObjectKeyData to set
 *
 */
  public void setBsdApplication(BsdApplicationObjectKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdApplication passed into the constructor
 * @return Simulated response
 *
 */
  public BsdApplicationObjectKeyData getBsdApplication() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdApplicationObjectKeyHelper.fromMap(inputMap, "BsdApplication");
  }
}
