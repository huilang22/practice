
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
  * 
The GenericEnumeration API is used to configure new language specific enumerations, often used by GUIs.
    .
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 */
@Remote
public interface GenericEnumerationInterface extends BaliInterface {

  /**
   * 
The GenericEnumerationGet method retrieves one GenericEnumeration row.
            .
   * Convenience method using default BSDMSessionContext.
   * @param GEGetIn Input Object Key.
   * @return GEObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GEObjectData get (GEObjectKeyData GEGetIn) throws BSDMResourceException;
  /**
   * 
The GenericEnumerationGet method retrieves one GenericEnumeration row.
            .
   * @param context The session context to use when connecting to the APITS server.
   * @param GEGetIn Input Object Key.
   * @return GEObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GEObjectData get (BSDMSessionContext context, GEObjectKeyData GEGetIn) throws BSDMResourceException;


  /**
   * 
The GenericEnumerationGet method retrieves one GenericEnumeration row.
            .
   * Convenience method using default BSDMSessionContext.
   * @param GEGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GEObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GEObjectData get (GEObjectKeyData GEGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * 
The GenericEnumerationGet method retrieves one GenericEnumeration row.
            .
   * @param context The session context to use when connecting to the APITS server.
   * @param GEGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GEObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GEObjectData get (BSDMSessionContext context, GEObjectKeyData GEGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * 
Finds all GenericEnumeration objects matching the supplied filter.
            .
   * Convenience method using default BSDMSessionContext.
   * @param GEFindIn Input Filter Object.
   * @return GEObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GEObjectDataList find (GEObjectFilter GEFindIn) throws BSDMResourceException;
  /**
   * 
Finds all GenericEnumeration objects matching the supplied filter.
            .
   * @param context The session context to use when connecting to the APITS server.
   * @param GEFindIn Input Filter Object.
   * @return GEObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GEObjectDataList find (BSDMSessionContext context, GEObjectFilter GEFindIn) throws BSDMResourceException;


  /**
   * 
Finds all GenericEnumeration objects matching the supplied filter.
            .
   * Convenience method using default BSDMSessionContext.
   * @param GEFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GEObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GEObjectDataList find (GEObjectFilter GEFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * 
Finds all GenericEnumeration objects matching the supplied filter.
            .
   * @param context The session context to use when connecting to the APITS server.
   * @param GEFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GEObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GEObjectDataList find (BSDMSessionContext context, GEObjectFilter GEFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * 
Update the values (other than the key) of the GenericEnumeration object.
            .
   * Convenience method using default BSDMSessionContext.
   * @param GEUpdateIn Input  Object.
   * @return GEObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GEObjectData update (GEObjectData GEUpdateIn) throws BSDMResourceException;
  /**
   * 
Update the values (other than the key) of the GenericEnumeration object.
            .
   * @param context The session context to use when connecting to the APITS server.
   * @param GEUpdateIn Input  Object.
   * @return GEObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GEObjectData update (BSDMSessionContext context, GEObjectData GEUpdateIn) throws BSDMResourceException;


  /**
   * 
Update the values (other than the key) of the GenericEnumeration object.
            .
   * Convenience method using default BSDMSessionContext.
   * @param GEUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GEObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GEObjectData update (GEObjectData GEUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * 
Update the values (other than the key) of the GenericEnumeration object.
            .
   * @param context The session context to use when connecting to the APITS server.
   * @param GEUpdateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GEObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GEObjectData update (BSDMSessionContext context, GEObjectData GEUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * 
Delete the Generic Enumeration row.
            .
   * Convenience method using default BSDMSessionContext.
   * @param GEDeleteIn Input Object Key.
   * @return GEObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GEObjectData delete (GEObjectKeyData GEDeleteIn) throws BSDMResourceException;
  /**
   * 
Delete the Generic Enumeration row.
            .
   * @param context The session context to use when connecting to the APITS server.
   * @param GEDeleteIn Input Object Key.
   * @return GEObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GEObjectData delete (BSDMSessionContext context, GEObjectKeyData GEDeleteIn) throws BSDMResourceException;


  /**
   * 
Delete the Generic Enumeration row.
            .
   * Convenience method using default BSDMSessionContext.
   * @param GEDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GEObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GEObjectData delete (GEObjectKeyData GEDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * 
Delete the Generic Enumeration row.
            .
   * @param context The session context to use when connecting to the APITS server.
   * @param GEDeleteIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GEObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GEObjectData delete (BSDMSessionContext context, GEObjectKeyData GEDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * 
Insert a new row in GENERIC_ENUMERATION_VALUES, as well as if necessary GENERIC_ENUMERATION_REF.
            .
   * Convenience method using default BSDMSessionContext.
   * @param GECreateIn Input  Object.  Defaulted Fields: LanguageCode, IsDefault, IsInternal, SortIndex.
   * @return GEObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GEObjectData create (GEObjectData GECreateIn) throws BSDMResourceException;
  /**
   * 
Insert a new row in GENERIC_ENUMERATION_VALUES, as well as if necessary GENERIC_ENUMERATION_REF.
            .
   * @param context The session context to use when connecting to the APITS server.
   * @param GECreateIn Input  Object.  Defaulted Fields: LanguageCode, IsDefault, IsInternal, SortIndex.
   * @return GEObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public GEObjectData create (BSDMSessionContext context, GEObjectData GECreateIn) throws BSDMResourceException;


  /**
   * 
Insert a new row in GENERIC_ENUMERATION_VALUES, as well as if necessary GENERIC_ENUMERATION_REF.
            .
   * Convenience method using default BSDMSessionContext.
   * @param GECreateIn Input  Object.  Defaulted Fields: LanguageCode, IsDefault, IsInternal, SortIndex.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GEObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public GEObjectData create (GEObjectData GECreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * 
Insert a new row in GENERIC_ENUMERATION_VALUES, as well as if necessary GENERIC_ENUMERATION_REF.
            .
   * @param context The session context to use when connecting to the APITS server.
   * @param GECreateIn Input  Object.  Defaulted Fields: LanguageCode, IsDefault, IsInternal, SortIndex.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return GEObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public GEObjectData create (BSDMSessionContext context, GEObjectData GECreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
