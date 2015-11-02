
package com.csgsystems.bp.interfaces;

import java.io.*;
import java.math.*;
import java.util.*;

import javax.ejb.Remote;

import com.csgsystems.bali.BaliInterface;

import com.csgsystems.aruba.connection.BSDMResourceException;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.constraint.ConstraintException;


import com.csgsystems.bp.data.*;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 */
@Remote
public interface GuiIndicatorInterface extends BaliInterface {

  /**
   * Get a unique GuiIndicator..
   * Convenience method using default BSDMSessionContext.
   * @param GIGetIn Input Object Key.
   * @return GuiIndicatorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GuiIndicatorObjectData get (GuiIndicatorObjectKeyData GIGetIn) throws BSDMResourceException;
  /**
   * Get a unique GuiIndicator..
   * @param context The session context to use when connecting to the APITS server.
   * @param GIGetIn Input Object Key.
   * @return GuiIndicatorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GuiIndicatorObjectData get (BSDMSessionContext context, GuiIndicatorObjectKeyData GIGetIn) throws BSDMResourceException;


  /**
   * Get a unique GuiIndicator..
   * Convenience method using default BSDMSessionContext.
   * @param GIGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GuiIndicatorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GuiIndicatorObjectData get (GuiIndicatorObjectKeyData GIGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique GuiIndicator..
   * @param context The session context to use when connecting to the APITS server.
   * @param GIGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GuiIndicatorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GuiIndicatorObjectData get (BSDMSessionContext context, GuiIndicatorObjectKeyData GIGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find GuiIndicator's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param GIFindIn Input Filter Object.
   * @return GuiIndicatorObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GuiIndicatorObjectDataList find (GuiIndicatorObjectFilter GIFindIn) throws BSDMResourceException;
  /**
   * Find GuiIndicator's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GIFindIn Input Filter Object.
   * @return GuiIndicatorObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GuiIndicatorObjectDataList find (BSDMSessionContext context, GuiIndicatorObjectFilter GIFindIn) throws BSDMResourceException;


  /**
   * Find GuiIndicator's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param GIFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GuiIndicatorObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GuiIndicatorObjectDataList find (GuiIndicatorObjectFilter GIFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find GuiIndicator's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GIFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GuiIndicatorObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GuiIndicatorObjectDataList find (BSDMSessionContext context, GuiIndicatorObjectFilter GIFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update the non-key fields of a GuiIndicator..
   * Convenience method using default BSDMSessionContext.
   * @param GIUpdateIn Input  Object.
   * @return GuiIndicatorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GuiIndicatorObjectData update (GuiIndicatorObjectData GIUpdateIn) throws BSDMResourceException;
  /**
   * Update the non-key fields of a GuiIndicator..
   * @param context The session context to use when connecting to the APITS server.
   * @param GIUpdateIn Input  Object.
   * @return GuiIndicatorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GuiIndicatorObjectData update (BSDMSessionContext context, GuiIndicatorObjectData GIUpdateIn) throws BSDMResourceException;


  /**
   * Update the non-key fields of a GuiIndicator..
   * Convenience method using default BSDMSessionContext.
   * @param GIUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GuiIndicatorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GuiIndicatorObjectData update (GuiIndicatorObjectData GIUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update the non-key fields of a GuiIndicator..
   * @param context The session context to use when connecting to the APITS server.
   * @param GIUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GuiIndicatorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GuiIndicatorObjectData update (BSDMSessionContext context, GuiIndicatorObjectData GIUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Delete a GuiIndicator..
   * Convenience method using default BSDMSessionContext.
   * @param GIDeleteIn Input Object Key.
   * @return GuiIndicatorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GuiIndicatorObjectData delete (GuiIndicatorObjectKeyData GIDeleteIn) throws BSDMResourceException;
  /**
   * Delete a GuiIndicator..
   * @param context The session context to use when connecting to the APITS server.
   * @param GIDeleteIn Input Object Key.
   * @return GuiIndicatorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GuiIndicatorObjectData delete (BSDMSessionContext context, GuiIndicatorObjectKeyData GIDeleteIn) throws BSDMResourceException;


  /**
   * Delete a GuiIndicator..
   * Convenience method using default BSDMSessionContext.
   * @param GIDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GuiIndicatorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GuiIndicatorObjectData delete (GuiIndicatorObjectKeyData GIDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Delete a GuiIndicator..
   * @param context The session context to use when connecting to the APITS server.
   * @param GIDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GuiIndicatorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GuiIndicatorObjectData delete (BSDMSessionContext context, GuiIndicatorObjectKeyData GIDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new GuiIndicator..
   * Convenience method using default BSDMSessionContext.
   * @param GICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return GuiIndicatorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GuiIndicatorObjectData create (GuiIndicatorObjectData GICreateIn) throws BSDMResourceException;
  /**
   * Create a new GuiIndicator..
   * @param context The session context to use when connecting to the APITS server.
   * @param GICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return GuiIndicatorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GuiIndicatorObjectData create (BSDMSessionContext context, GuiIndicatorObjectData GICreateIn) throws BSDMResourceException;


  /**
   * Create a new GuiIndicator..
   * Convenience method using default BSDMSessionContext.
   * @param GICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GuiIndicatorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GuiIndicatorObjectData create (GuiIndicatorObjectData GICreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new GuiIndicator..
   * @param context The session context to use when connecting to the APITS server.
   * @param GICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GuiIndicatorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GuiIndicatorObjectData create (BSDMSessionContext context, GuiIndicatorObjectData GICreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
