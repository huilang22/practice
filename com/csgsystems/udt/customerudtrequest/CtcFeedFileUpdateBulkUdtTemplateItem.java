/*
 * Generated code DO NOT EDIT
 * Generated file: CtcFeedFileUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CtcFeedFileUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcFeedFileUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcFeedFileObjectData UpdateIn;
/**
 *
 * Constructor to create a  CtcFeedFileUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcFeedFileUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcFeedFileObjectData UpdateInIn) {
    super(id, context, "CtcFeedFileUpdate");
    UpdateIn = UpdateInIn;
  }

  public void translateToMap() {
    if (UpdateIn != null) {
      UpdateIn.resetFlags(true, true);
      addInput("CtcFeedFile", CtcFeedFileObjectHelper.toMap(UpdateIn, new HashMap(), "CtcFeedFile").get("CtcFeedFile"));
    }
  }


/**
 *
 * Sets the CtcFeedFile
 * @param UpdateInIn Value of the UpdateIn
 *
 */

  public void setCtcFeedFile(CtcFeedFileObjectData UpdateInIn) {
    UpdateIn = UpdateInIn;
  }

  public void translateFromMap() {
    UpdateIn = CtcFeedFileObjectHelper.fromMap(inputMap, "CtcFeedFile");
  }

/**
 *
 * Gets the CtcFeedFile
 * @return Value of the CtcFeedFile
 *
 */

  public CtcFeedFileObjectData getCtcFeedFile( ) {
    return UpdateIn;
  }

}
