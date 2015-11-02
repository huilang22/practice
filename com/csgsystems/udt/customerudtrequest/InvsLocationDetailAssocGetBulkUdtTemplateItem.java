/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationDetailAssocGetBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsLocationDetailAssocGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLocationDetailAssocGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLocationTablesObjectKeyData InvsLocationDetailAssocGetIn;
/**
 *
 * Constructor to create a  InvsLocationDetailAssocGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLocationDetailAssocGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationTablesObjectKeyData InvsLocationDetailAssocGetInIn) {
    super(id, context, "InvsLocationDetailAssocGet");
    InvsLocationDetailAssocGetIn = InvsLocationDetailAssocGetInIn;
  }

  public void translateToMap() {
    if (InvsLocationDetailAssocGetIn != null) {
      InvsLocationDetailAssocGetIn.resetFlags(true, true);
      addInput("InvsLocationDetailAssoc", InvsLocationTablesObjectKeyHelper.toMap(InvsLocationDetailAssocGetIn, new HashMap(), "InvsLocationTablesObjectKeyData").get("InvsLocationTablesObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsLocationDetailAssoc
 * @param InvsLocationDetailAssocGetInIn Value of the InvsLocationDetailAssocGetIn
 *
 */

  public void setInvsLocationDetailAssoc(InvsLocationTablesObjectKeyData InvsLocationDetailAssocGetInIn) {
    InvsLocationDetailAssocGetIn = InvsLocationDetailAssocGetInIn;
  }

  public void translateFromMap() {
    InvsLocationDetailAssocGetIn = InvsLocationTablesObjectKeyHelper.fromMap(inputMap, "InvsLocationDetailAssoc");
  }

/**
 *
 * Gets the InvsLocationDetailAssoc
 * @return Value of the InvsLocationDetailAssoc
 *
 */

  public InvsLocationTablesObjectKeyData getInvsLocationDetailAssoc( ) {
    return InvsLocationDetailAssocGetIn;
  }

}
