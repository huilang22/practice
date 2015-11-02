/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeDefaultDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdAttributeDefaultDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdAttributeDefaultDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdAttributeDefaultObjectBaseData noOpIn;

/**
 *
 * Constructor to create a   BsdAttributeDefaultDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdAttributeDefaultDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeDefaultObjectBaseData noOpInIn) {
    super(id, context, "BsdAttributeDefaultDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdAttributeDefault", BsdAttributeDefaultObjectBaseHelper.toMap(noOpIn, new HashMap(), "BsdAttributeDefault").get("BsdAttributeDefault"));
    }
  }
/**
 *
 * Sets the  BsdAttributeDefault
 * @param noOpInIn BsdAttributeDefaultObjectBaseData to set
 *
 */
  public void setBsdAttributeDefault(BsdAttributeDefaultObjectBaseData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdAttributeDefault passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeDefaultObjectBaseData getBsdAttributeDefault() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdAttributeDefaultObjectBaseHelper.fromMap(inputMap, "BsdAttributeDefault");
  }
}
