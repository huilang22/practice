/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentDefinitionPriceBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a ComponentDefinitionPriceBulkUdtTemplateItem Bulk Template
 *
 */

public class ComponentDefinitionPriceBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CDObjectKeyData cdpComponentDefinitionIn;
  protected RatingKeyObjectData cdpRatingKeyIn;
/**
 *
 * Constructor to create a  ComponentDefinitionPriceBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ComponentDefinitionPriceBulkUdtTemplateItem(String id, BSDMSessionContext context, CDObjectKeyData cdpComponentDefinitionInIn, RatingKeyObjectData cdpRatingKeyInIn) {
    super(id, context, "ComponentDefinitionPrice");
    cdpComponentDefinitionIn = cdpComponentDefinitionInIn;
    cdpRatingKeyIn = cdpRatingKeyInIn;
  }

  public void translateToMap() {
    if (cdpComponentDefinitionIn != null) {
      cdpComponentDefinitionIn.resetFlags(true, true);
      addInput("Component", CDObjectKeyHelper.toMap(cdpComponentDefinitionIn, new HashMap(), "CDObjectKeyData").get("CDObjectKeyData"));
    }
    if (cdpRatingKeyIn != null) {
      cdpRatingKeyIn.resetFlags(true, true);
      addInput("RatingKey", RatingKeyObjectHelper.toMap(cdpRatingKeyIn, new HashMap(), "CdPrice").get("CdPrice"));
    }
  }


/**
 *
 * Sets the Component
 * @param cdpComponentDefinitionInIn Value of the cdpComponentDefinitionIn
 *
 */

  public void setComponent(CDObjectKeyData cdpComponentDefinitionInIn) {
    cdpComponentDefinitionIn = cdpComponentDefinitionInIn;
  }

/**
 *
 * Sets the RatingKey
 * @param cdpRatingKeyInIn Value of the cdpRatingKeyIn
 *
 */

  public void setRatingKey(RatingKeyObjectData cdpRatingKeyInIn) {
    cdpRatingKeyIn = cdpRatingKeyInIn;
  }

  public void translateFromMap() {
    cdpComponentDefinitionIn = CDObjectKeyHelper.fromMap(inputMap, "Component");
    cdpRatingKeyIn = RatingKeyObjectHelper.fromMap(inputMap, "RatingKey");
  }

/**
 *
 * Gets the Component
 * @return Value of the Component
 *
 */

  public CDObjectKeyData getComponent( ) {
    return cdpComponentDefinitionIn;
  }

/**
 *
 * Gets the RatingKey
 * @return Value of the RatingKey
 *
 */

  public RatingKeyObjectData getRatingKey( ) {
    return cdpRatingKeyIn;
  }

}
