/*
 * Generated code DO NOT EDIT
 * Generated file: BsdConstraintDescriptionSequenceGetNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * NoOp class used to simulate a BsdConstraintDescriptionSequenceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdConstraintDescriptionSequenceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdConstraintDescriptionObjectKeyData noOpIn;

/**
 *
 * Constructor to create a   BsdConstraintDescriptionSequenceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdConstraintDescriptionSequenceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdConstraintDescriptionObjectKeyData noOpInIn) {
    super(id, context, "BsdConstraintDescriptionSequenceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdConstraintDescription", BsdConstraintDescriptionObjectKeyHelper.toMap(noOpIn, new HashMap(), "BsdConstraintDescription").get("BsdConstraintDescription"));
    }
  }
/**
 *
 * Sets the  BsdConstraintDescription
 * @param noOpInIn BsdConstraintDescriptionObjectKeyData to set
 *
 */
  public void setBsdConstraintDescription(BsdConstraintDescriptionObjectKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdConstraintDescription passed into the constructor
 * @return Simulated response
 *
 */
  public BsdConstraintDescriptionObjectKeyData getBsdConstraintDescription() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdConstraintDescriptionObjectKeyHelper.fromMap(inputMap, "BsdConstraintDescription");
  }
}
