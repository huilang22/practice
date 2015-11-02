/*
 * Generated code DO NOT EDIT
 * Generated file: CtcFeedFileFindBulkUdtTemplateItem.java
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
 * Class used to create a CtcFeedFileFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcFeedFileFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcFeedFileObjectFilter FindIn;
/**
 *
 * Constructor to create a  CtcFeedFileFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcFeedFileFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcFeedFileObjectFilter FindInIn) {
    super(id, context, "CtcFeedFileFind");
    FindIn = FindInIn;
  }

  public void translateToMap() {
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcFeedFile", CtcFeedFileObjectHelper.toMap(FindIn, new HashMap(), "CtcFeedFile").get("CtcFeedFile"));
    }
  }


/**
 *
 * Sets the CtcFeedFile
 * @param FindInIn Value of the FindIn
 *
 */

  public void setCtcFeedFile(CtcFeedFileObjectFilter FindInIn) {
    FindIn = FindInIn;
  }

  public void translateFromMap() {
    FindIn = CtcFeedFileObjectHelper.fromMapFilter(inputMap, "CtcFeedFile");
  }

/**
 *
 * Gets the CtcFeedFile
 * @return Value of the CtcFeedFile
 *
 */

  public CtcFeedFileObjectFilter getCtcFeedFile( ) {
    return FindIn;
  }

}
