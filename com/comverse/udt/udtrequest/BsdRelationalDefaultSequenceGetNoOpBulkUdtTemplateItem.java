/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalDefaultSequenceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdRelationalDefaultSequenceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdRelationalDefaultSequenceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdRelationalDefaultObjectBaseKeyData noOpIn;

/**
 *
 * Constructor to create a   BsdRelationalDefaultSequenceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdRelationalDefaultSequenceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalDefaultObjectBaseKeyData noOpInIn) {
    super(id, context, "BsdRelationalDefaultSequenceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdRelationalDefault", BsdRelationalDefaultObjectBaseKeyHelper.toMap(noOpIn, new HashMap(), "BsdRelationalDefault").get("BsdRelationalDefault"));
    }
  }
/**
 *
 * Sets the  BsdRelationalDefault
 * @param noOpInIn BsdRelationalDefaultObjectBaseKeyData to set
 *
 */
  public void setBsdRelationalDefault(BsdRelationalDefaultObjectBaseKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdRelationalDefault passed into the constructor
 * @return Simulated response
 *
 */
  public BsdRelationalDefaultObjectBaseKeyData getBsdRelationalDefault() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdRelationalDefaultObjectBaseKeyHelper.fromMap(inputMap, "BsdRelationalDefault");
  }
}
