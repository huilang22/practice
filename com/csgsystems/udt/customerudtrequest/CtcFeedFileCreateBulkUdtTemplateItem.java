/*
 * Generated code DO NOT EDIT
 * Generated file: CtcFeedFileCreateBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * Class used to create a CtcFeedFileCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcFeedFileCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcFeedFileObjectData CreateIn;
/**
 *
 * Constructor to create a  CtcFeedFileCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcFeedFileCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcFeedFileObjectData CreateInIn) {
    super(id, context, "CtcFeedFileCreate");
    CreateIn = CreateInIn;
  }

  public void translateToMap() {
    if (CreateIn != null) {
      CreateIn.resetFlags(true, true);
      addInput("CtcFeedFile", CtcFeedFileObjectHelper.toMap(CreateIn, new HashMap(), "CtcFeedFile").get("CtcFeedFile"));
    }
  }


/**
 *
 * Sets the CtcFeedFile
 * @param CreateInIn Value of the CreateIn
 *
 */

  public void setCtcFeedFile(CtcFeedFileObjectData CreateInIn) {
    CreateIn = CreateInIn;
  }

  public void translateFromMap() {
    CreateIn = CtcFeedFileObjectHelper.fromMap(inputMap, "CtcFeedFile");
  }

/**
 *
 * Gets the CtcFeedFile
 * @return Value of the CtcFeedFile
 *
 */

  public CtcFeedFileObjectData getCtcFeedFile( ) {
    return CreateIn;
  }

}
